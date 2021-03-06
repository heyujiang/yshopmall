package co.yixiang.modules.activity.service;

import co.yixiang.modules.activity.domain.YxStorePink;
import co.yixiang.modules.activity.service.dto.YxStorePinkDTO;
import co.yixiang.modules.activity.service.dto.YxStorePinkQueryCriteria;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
* @author hupeng
* @date 2019-11-18
*/
//@CacheConfig(cacheNames = "yxStorePink")
public interface YxStorePinkService {

    int countPeople(int id);

    /**
    * 查询数据分页
    * @param criteria
    * @param pageable
    * @return
    */
    //@Cacheable
    Map<String,Object> queryAll(YxStorePinkQueryCriteria criteria, Pageable pageable);

    /**
    * 查询所有数据不分页
    * @param criteria
    * @return
    */
    //@Cacheable
    List<YxStorePinkDTO> queryAll(YxStorePinkQueryCriteria criteria);

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    //@Cacheable(key = "#p0")
    YxStorePinkDTO findById(Integer id);

    /**
     * 创建
     * @param resources
     * @return
     */
    //@CacheEvict(allEntries = true)
    YxStorePinkDTO create(YxStorePink resources);

    /**
     * 编辑
     * @param resources
     */
    //@CacheEvict(allEntries = true)
    void update(YxStorePink resources);

    /**
     * 删除
     * @param id
     */
    //@CacheEvict(allEntries = true)
    void delete(Integer id);
}