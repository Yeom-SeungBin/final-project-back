package com.example.finalproject.userapi.repository;

import com.example.finalproject.userapi.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, String> {



}















































