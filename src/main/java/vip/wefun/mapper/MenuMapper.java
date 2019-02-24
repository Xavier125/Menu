package vip.wefun.mapper;

import vip.wefun.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selByPid(int pid);
}
