package cx.study.service;

import cx.study.domain.User;

public interface UserService {

    public User findByName(String name);

    public User findById(Integer id);
}
