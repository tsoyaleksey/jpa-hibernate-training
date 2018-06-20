package net.training.domain.extended;

import java.util.Date;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Data
@Embeddable
public class TemporalTypes {

    @Temporal(TemporalType.DATE)
    private Date birthDay;

    @Temporal(TemporalType.TIME)
    private Date hiringDay;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dismissalDay;
}
