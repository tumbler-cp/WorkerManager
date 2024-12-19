package lab.arahnik.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Address officialAddress;
    @Min(1)
    private Float annualTurnover;
    @NotNull
    private Long employeesCount;
    @NotBlank
    @Column(unique = true, nullable = false)
    private String fullName;
    @Min(1)
    private Float rating;
}
