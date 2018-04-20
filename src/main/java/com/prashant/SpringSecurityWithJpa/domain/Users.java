package com.prashant.SpringSecurityWithJpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="user_table")
@EntityListeners(AuditingEntityListener.class)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @Column(name="roles")
    private String role;

   /* public static void main(String[] args) {
        String result=",";
        String abc="Admin,Super_Admin,user";
        List<String> arr= Arrays.asList(abc.split(","));
        System.out.println(arr);
        for(String i:arr) {
            for(Role role:Role.values()){
                if(i.equalsIgnoreCase(role.name())){
                    String out=role.ordinal()+",";
                    result=result+out;
                }
            }
        }
        System.out.print(result);


    }*/

}
