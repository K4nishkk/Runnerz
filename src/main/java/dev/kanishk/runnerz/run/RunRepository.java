package dev.kanishk.runnerz.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>(); // here we have store the runs, in an array

    // low level methods to interact with runs
    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id().equals(id))
                .findFirst();
    }

    void create(Run run) {
        runs.add(run);
    }

    void update(Run run, Integer id) {
        Optional<Run> existingRun = findById(id);
        if (existingRun.isPresent()) {
            runs.set(runs.indexOf(existingRun.get()), run);
        }
    }

    void delete(Integer id) {
        runs.removeIf(run -> run.id().equals(id));
    }

    @PostConstruct
    public void init() {
        runs.add(new Run(1,
                "Monday Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3,
                Location.INDOOR));

        runs.add(new Run(2,
                "Wednesday Evening Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(1, ChronoUnit.HOURS),
                6,
                Location.OUTDOOR));
    }
}
