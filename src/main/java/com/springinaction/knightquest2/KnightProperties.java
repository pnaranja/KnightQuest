package com.springinaction.knightquest2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:knight.properties")
public class KnightProperties {
}
