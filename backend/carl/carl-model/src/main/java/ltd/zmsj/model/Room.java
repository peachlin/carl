package ltd.zmsj.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class Room extends BaseItem {

  private String buildingId;
  private String partitionId;
  private String chargeCode;
  private String householdName;
  private String roomLocation;
  private String floor;
  private HouseholdType householdType;
  private HeatingType heatingType;
  private CalculationType calculationType;
  private String phone;
  private String remark;

}
