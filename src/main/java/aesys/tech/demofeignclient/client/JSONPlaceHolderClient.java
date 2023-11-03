package aesys.tech.demofeignclient.client;

import aesys.tech.demofeignclient.dto.PostDto;
import aesys.tech.demofeignclient.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "jplaceholder", url = "https://jsonplaceholder.typicode.com/")
public interface JSONPlaceHolderClient {
    //user
    @RequestMapping(method = RequestMethod.GET, value = "/users")
    List<UserDto> getUserDto();
    @RequestMapping(method = RequestMethod.GET, value = "/users/{userId}")
    UserDto getUserDtoById(@PathVariable("id") Long userId);

    //post
    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<PostDto> getPost();
    @RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
    PostDto getPostById(@PathVariable("postId") Long postId);
    @RequestMapping(method = RequestMethod.GET, value = "/posts/{userId}", produces = "application/json")
    PostDto getPostByUserId(@PathVariable("userId") Long userId);
}
