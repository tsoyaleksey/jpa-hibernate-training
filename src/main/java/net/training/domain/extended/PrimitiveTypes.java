package net.training.domain.extended;

import java.math.BigInteger;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class PrimitiveTypes {
    private byte mappingByte;
    private Byte mappingByte2;

    private short mappingShort;
    private Short mappingShort2;

    private int mappingInt;
    private Integer mappingInt2;

    private long mappingLong;
    private Long mappingLong2;

    private char mappingChar;
    private Character mappingCharacter;

    private String mappingString;

    private boolean mappingBoolean;
    private Boolean mappingBoolean2;

    private double mappingDouble;
    private Double mappingDouble2;

    private BigInteger mappingBigInteger;
    
}
