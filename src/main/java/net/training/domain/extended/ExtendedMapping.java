package net.training.domain.extended;

import lombok.Data;
import net.training.domain.BaseEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "EXTENDED_MAPPING")
public class ExtendedMapping extends BaseEntity {
	
	@Embedded
    private LargeObjects largeObjects;
	
    @Embedded
    private PrimitiveTypes primitiveTypes;
    
    @Embedded
    private TemporalTypes temporalTypes;

}
