package com.film.FilmDatabase;


import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.*;

import com.google.gson.Gson;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class ApplicationConfig {
    @Bean
    public DataSource dataSource(){
        AWSSecrets secrets = getSecret();
        return DataSourceBuilder
                .create()
                //.driverClassName("com.mysql")
                .url("jdbc:mysql://myawsdatabase.cceswjhg8xzg.us-east-1.rds.amazonaws.com:3306/sakila?useSSL=false&serverTimezone=UTC")
                .username(secrets.getUsername())
                .password(secrets.getPassword())
                .build();

    }

    private Gson gson = new Gson();

    private AWSSecrets getSecret() {

        String secretName = "TestingDB";
        String region = "us-east-1";



        // Create a Secrets Manager client
        AWSSecretsManager client  = AWSSecretsManagerClientBuilder.standard()
                .withRegion(region)
                .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials("AKIAVABAWSH3ZJLBHGWR","TLZLbt2RKBalw4r0yaLHFQxRQh7sRljL7zjT9nE6")))
                .build();



        String secret, decodedBinarySecret;
        GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
                .withSecretId(secretName);
        GetSecretValueResult getSecretValueResult = null;

        try {
            getSecretValueResult = client.getSecretValue(getSecretValueRequest);
        } catch (Exception e) {

            throw e;
        }


        if (getSecretValueResult.getSecretString() != null) {
            secret = getSecretValueResult.getSecretString();
            return gson.fromJson(secret,AWSSecrets.class);
        }

        return null;



    }


}
