package exercisefor.javaspring.exsixjavaspringpro.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "a_applications")
@Data
public class Application {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "commentary")
    private String commentary;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "handl_ed")
    private boolean handled;

}
