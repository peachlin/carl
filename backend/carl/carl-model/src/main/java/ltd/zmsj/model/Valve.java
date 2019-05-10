package ltd.zmsj.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class Valve extends BaseItem {

  private String roomId;
  private String location;
  private String model;
  private String netCode;
  private String collectCode;
  private Date dataTime;
  private ValveStatus valveStatus;
  private PowerStatus powerStatus;
  private DeviceStatus deviceStatus;
}
