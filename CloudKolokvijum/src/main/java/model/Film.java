package model;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

@Table(name = "sv_36_2021")

public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(nullable = false, name = "title")
    private String title;


    @Column(nullable = false, name = "genre")
    private String genre;


    @Column(nullable = false, name = "year")
    private Long year;


    public Film(Film film){
        this.id = film.id;
        this.title = film.title;
        this.genre = film.genre;
        this.year = film.year;
    }
}
