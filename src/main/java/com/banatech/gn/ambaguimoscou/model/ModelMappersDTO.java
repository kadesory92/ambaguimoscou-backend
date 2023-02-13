package com.banatech.gn.ambaguimoscou.model;

import com.banatech.gn.ambaguimoscou.domain.*;
import org.springframework.beans.BeanUtils;

public class ModelMappersDTO {
    public UserDTO userToUserDTO(User user){
        UserDTO userDTO=new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }
    public User userDTOToUser(UserDTO userDTO){
        User user=new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }
    public RequestsDTO requestsToRequestsDTO(Requests requests){
        RequestsDTO requestsDTO=new RequestsDTO();
        BeanUtils.copyProperties(requests, requestsDTO);
        return requestsDTO;
    }
    public Requests requestsDTOToRequests(RequestsDTO requestsDTO){
        Requests requests=new Requests();
        BeanUtils.copyProperties(requestsDTO, requests);
        return requests;
    }
    public PostDTO postToPostDTO(Post post){
        PostDTO postDTO=new PostDTO();
        BeanUtils.copyProperties(post, postDTO);
        return postDTO;
    }
    public Post postDTOToPost(PostDTO postDTO){
        Post post=new Post();
        BeanUtils.copyProperties(postDTO, post);
        return post;
    }
    public FolderDTO folderToFolderDTO(Folder folder){
        FolderDTO folderDTO=new FolderDTO();
        BeanUtils.copyProperties(folder, folderDTO);
        return folderDTO;
    }
    public Folder folderDTOToFolder(FolderDTO folderDTO){
        Folder folder=new Folder();
        BeanUtils.copyProperties(folderDTO, folder);
        return folder;
    }
    public CategoryDTO categoryToCategoryDTO(Category category){
        CategoryDTO categoryDTO=new CategoryDTO();
        BeanUtils.copyProperties(categoryDTO, category);
        return categoryDTO;
    }
    public Category categoryDTOToCategory(CategoryDTO categoryDTO){
        Category category=new Category();
        BeanUtils.copyProperties(categoryDTO, category);
        return category;
    }
    public AppointmentDTO appointmentToAppointmentDTO(Appointment appointment){
        AppointmentDTO appointmentDTO=new AppointmentDTO();
        BeanUtils.copyProperties(appointmentDTO, appointment);
        return appointmentDTO;
    }
    public Appointment appointmentDTOToAppointment(AppointmentDTO appointmentDTO){
        Appointment appointment=new Appointment();
        BeanUtils.copyProperties(appointment, appointmentDTO);
        return appointment;
    }
}
