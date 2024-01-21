package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Resource;
import com.java.course.isdb.exception.ResourceNotFoundException;
import com.java.course.isdb.repository.ResourceRepository;
import com.java.course.isdb.service.ResourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResourceServiceImpl implements ResourceService {

    private final ResourceRepository resourceRepository;

    @Override
    @Transactional
    public Resource add(Integer map_id, Integer resource_type_id, Integer quantity, Integer x, Integer y) {
        Resource resource = new Resource()
                .setMap_id(map_id)
                .setResource_type_id(resource_type_id)
                .setQuantity(quantity)
                .setX(x)
                .setY(y);

        resourceRepository.save(resource);

        return resource;
    }

    @Override
    @Transactional
    public Resource remove(Integer resourceId) {
        Resource resource = resourceRepository.findById(resourceId).orElseThrow(
                () -> new ResourceNotFoundException("resource doesn't exist")
        );

        resourceRepository.delete(resource);

        return resource;
    }

    @Override
    @Transactional
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }
}
