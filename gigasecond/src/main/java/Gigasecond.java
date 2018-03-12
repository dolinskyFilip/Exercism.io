import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime birthDateTime;

    public Gigasecond(LocalDate birthDate) {
        this.birthDateTime = birthDate.atTime(0, 0);
    }

    public Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = birthDateTime;
    }

    public LocalDateTime getDate() {
        return birthDateTime.plusSeconds(1000000000);
    }

}


