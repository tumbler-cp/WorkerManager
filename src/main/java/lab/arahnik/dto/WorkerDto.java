package lab.arahnik.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class WorkerDto {
    @NotNull
    @NotBlank
    private String name;
    @Min(1)
    private double salary;
    @Min(1)
    private long rating;
}
