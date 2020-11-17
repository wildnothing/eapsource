package com.example.demo.domain;

import com.example.demo.domain.web.EapSourceResource;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "EAP_SOURCE")
public class EapSourceEntity implements Serializable {

    private static final long serialVersionUID = 6117386676173630400L;

    @Id
    @Column(name = "EAP_SOURCE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "NAME")
    private String name;

    public EapSourceEntity(String type, String name) {
        this.type = type;
        this.name = name;
    }
}
