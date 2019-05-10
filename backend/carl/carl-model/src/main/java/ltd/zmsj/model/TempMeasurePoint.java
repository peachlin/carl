package ltd.zmsj.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class TempMeasurePoint extends BaseItem {

  private String roomId;
  private String code;
  private String location;
  private String model;
  private String netCode;
  private String collectCode;
  private Date dataTime;
  private Double voltage;
  private Integer uploadCycle;
  private DeviceStatus deviceStatus;
}
