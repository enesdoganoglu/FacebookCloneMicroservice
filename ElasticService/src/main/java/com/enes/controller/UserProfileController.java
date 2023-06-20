package com.enes.controller;

import com.enes.constants.EndPointList;
import com.enes.dto.request.UserProfileDto;
import com.enes.repository.entity.UserProfile;
import com.enes.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elastic/userprofile")
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping(EndPointList.SAVE)
    public ResponseEntity<Void> save(@RequestBody UserProfileDto dto){
        userProfileService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(EndPointList.FIND_ALL)
    public ResponseEntity<Iterable<UserProfile>> findAll(){
        return ResponseEntity.ok(userProfileService.findAll());
    }


    @GetMapping("/findallpage")
    public ResponseEntity<Page<UserProfile>> findAll(int currentPage,int size, String sortParameter,String sortDirection){
        return ResponseEntity.ok(userProfileService.findAll(currentPage,size,sortParameter,sortDirection));
    }
}
