package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.ResourceType;
import com.java.course.isdb.exception.ResourceTypeNotFoundException;
import com.java.course.isdb.repository.ResourceTypeRepository;
import com.java.course.isdb.service.ResourceTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourceTypeServiceImpl implements ResourceTypeService {

    private final ResourceTypeRepository resourceTypeRepository;

    @Override
    @Transactional
    public ResourceType add(String name) {
        ResourceType resourceType = new ResourceType()
                .setName(name);

        resourceTypeRepository.save(resourceType);

        return resourceType;
    }

    @Override
    @Transactional
    public ResourceType remove(Integer resourceTypeId) {
        ResourceType resourceType = resourceTypeRepository.findById(resourceTypeId).orElseThrow(
                () -> new ResourceTypeNotFoundException("resourceType doesn't exist")
        );

        resourceTypeRepository.delete(resourceType);

        return resourceType;
    }

    @Override
    @Transactional
    public List<ResourceType> getAllResourceTypes() {
        return resourceTypeRepository.findAll();
    }
}
