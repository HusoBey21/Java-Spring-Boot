package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String doktorAdi;
    private String hastane;
    private String calisilanSehir;
    private int alinanMaas;
}
