package com.enes.controller;

import com.enes.dto.request.GetPostRequestDto;
import com.enes.dto.response.GetPostResponseDto;
import com.enes.repository.entity.Post;
import com.enes.repository.entity.PostResim;
import com.enes.service.PostResimService;
import com.enes.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final PostResimService postResimService;
    @PostMapping("/getposts")
    @CrossOrigin("*")
    public ResponseEntity<List<GetPostResponseDto>> getPosts(@RequestBody @Valid GetPostRequestDto dto){
        return ResponseEntity.ok(postService.getPosts(dto));
    }

    @PostMapping("/newpost")
    @CrossOrigin("*")
    public ResponseEntity<Void> newPost(String aciklama,String userid,String url,String url2){
        Post post = new Post();
        post.setAciklama(aciklama);
        post.setUserid(userid);
        post.setPaylasimzamani(System.currentTimeMillis());
        postService.save(post);
        /**
         * Post kayıt işleminden sonra post un id bilgisi atanmış olur.
         */
        PostResim postResim = new PostResim();
        postResim.setPostid(post.getId());
        postResim.setUrl(url);
        postResimService.save(postResim);
        postResim = new PostResim();
        postResim.setPostid(post.getId());
        postResim.setUrl(url2);
        postResimService.save(postResim);
        return ResponseEntity.ok().build();
    }
}
