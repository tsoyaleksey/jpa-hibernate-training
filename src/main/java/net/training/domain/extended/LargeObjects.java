package net.training.domain.extended;

import lombok.Data;

import javax.persistence.*;

@Data
@Embeddable
public class LargeObjects {

    @Lob
    @Column(name = "PROFILE_PHOTO")
    private byte[] profilePhoto;
    
    @Lob
    @Column(name = "SKYPE_PHOTO")
    @Basic(fetch = FetchType.LAZY)
    private Byte[] skypePhoto;
    
    @Lob
    @Column(name = "HISTORY")
    private History history;
    
    @Lob
    @Column(name = "REVIEWS")
    @Basic(fetch = FetchType.LAZY)
    private String reviews;
    
    @Lob
    @Column(name = "DOCS")
    @Basic(fetch = FetchType.LAZY)
    private char[] documentation;
    
    @Lob
    @Column(name = "ADDITIONAL_INFO")
    @Basic(fetch = FetchType.LAZY)
    private Character[] additionalInfo;
    
}
