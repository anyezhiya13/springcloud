package com.gen.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();
    }
}
