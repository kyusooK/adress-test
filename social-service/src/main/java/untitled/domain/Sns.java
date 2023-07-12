package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.SocialServiceApplication;

@Entity
@Table(name = "Sns_table")
@Data
public class Sns {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;

    private String name;

    @Embedded
    private Address address;

    public static SnsRepository repository() {
        SnsRepository snsRepository = SocialServiceApplication.applicationContext.getBean(
            SnsRepository.class
        );
        return snsRepository;
    }
}
