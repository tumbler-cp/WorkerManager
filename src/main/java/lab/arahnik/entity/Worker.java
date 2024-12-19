package lab.arahnik.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @OneToOne
    private Coordinates coordinates;

    @NotNull
    private LocalDate creationDate;

    @NotNull
    @ManyToOne
    private Organization organization;

    @Min(1)
    private Double salary;

    @Min(1)
    private Long rating;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Position position;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;

    @NotNull
    @OneToOne
    private Person person;

    @PrePersist
    protected void onCreate() {
        this.creationDate = LocalDate.now();
    }

}
