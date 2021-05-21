package workman.link.workman.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import workman.link.workman.entity.*;

@Mapper
@Repository
public interface userMapper extends BaseMapper<user> {

}
