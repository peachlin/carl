package ltd.zmsj.model;

import lombok.Data;

/**
 * @author wangk
 */
@Data
public class Alarm extends BaseItem {

  private String description;
  private Boolean enable;
  private Boolean value;
}
