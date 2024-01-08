package com.vti.Hshop.service;

import com.vti.Hshop.dto.AccessoryDto;
import com.vti.Hshop.form.AccessoryCreateForm;
import com.vti.Hshop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);

    void deleteById(Long id);
}
