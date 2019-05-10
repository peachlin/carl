package ltd.zmsj.model;

import lombok.Data;

/**
 * @author wangk
 */
@Data
public class Partition extends BaseItem {

  private PartitionType partitionType;
  private Integer totalHouseHold;
  private Integer builtUpArea;
  private Integer heatingArea;
  private Integer heatingHouseHold;
  private Integer actualHeatingArea;
  private Double vacancyRate;
  private CalculationType calMode;
}