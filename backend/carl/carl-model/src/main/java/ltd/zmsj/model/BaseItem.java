package ltd.zmsj.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class BaseItem {

  public String id;
  public String name;
  public Date createTime;
  public Date modifyTime;
}
