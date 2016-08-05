package com.namazed.remindapp.server.repository;

import com.namazed.remindapp.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
