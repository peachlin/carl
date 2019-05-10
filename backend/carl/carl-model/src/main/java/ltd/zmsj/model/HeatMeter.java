package ltd.zmsj.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class HeatMeter extends BaseItem {

  private String roomId;
  private String location;
  private String model;
  private String netCode;
  private String collectCode;
  private Date dataTime;
  private PowerStatus powerStatus;
  private DeviceStatus deviceStatus;
}
