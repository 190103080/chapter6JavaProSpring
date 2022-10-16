package exercisefor.javaspring.exsixjavaspringpro.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "a_applications")
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToOne(fetch = FetchType.EAGER)
    private Courses courses;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Operators> operators;

}
