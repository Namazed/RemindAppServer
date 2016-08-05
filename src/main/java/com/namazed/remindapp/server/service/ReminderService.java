package com.namazed.remindapp.server.service;

import com.namazed.remindapp.server.entity.Remind;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();

    Remind getByID(long id);

    Remind save(Remind remind);

    void remove(long id);

}
