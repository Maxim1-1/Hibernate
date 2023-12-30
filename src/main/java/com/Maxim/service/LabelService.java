package com.Maxim.service;

import com.Maxim.model.Label;
import com.Maxim.repository.LabelRepository;
import com.Maxim.repository.hibernate.HibernateLabelRepositoryImpl;

import java.util.List;

public class LabelService {

    private final LabelRepository hibernateLabelRepository = new HibernateLabelRepositoryImpl();

    public Label saveLabel(Label label) {
        return hibernateLabelRepository.save(label);
    }

    public Label getLabelById(Integer labelId) {
        return hibernateLabelRepository.getById(labelId);
    }

    public List<Label> getAllLabels() {
        return hibernateLabelRepository.getAll();
    }

    public Label updateLabel(Label label) {
        return hibernateLabelRepository.update(label);
    }

    public void deleteLabelById(Integer id) {
        hibernateLabelRepository.deleteById(id);
    }
}
