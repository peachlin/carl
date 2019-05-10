package ltd.zmsj.model;

import lombok.Data;

/**
 * @author wangk
 */
@Data
public class Building extends BaseItem {

  private Integer totalHouseHold;
  private Integer builtUpArea;
  private Integer heatingArea;
  private Integer heatingHouseHold;
  private Integer actualHeatingArea;
  private Double vacancyRate;
  private CalculationType calMode;
}
