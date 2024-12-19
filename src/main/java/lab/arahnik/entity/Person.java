package lab.arahnik.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Color eyeColor;
    private Color hairColor;
    @ManyToOne
    private Location location;
    @NotNull
    @Min(1)
    private Double height;
    @NotNull
    @Min(1)
    private Long weight;
    @NotNull
    private String passportID;
}
