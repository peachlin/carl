package ltd.zmsj.model;

import java.util.Date;
import lombok.Data;

/**
 * @author wangk
 */
@Data
public class WirelessPanel extends BaseItem {

  private String roomId;
  private String location;
  private String model;
  private String netCode;
  private String collectCode;
  private Date dataTime;
  private Double voltage;
  private DeviceStatus deviceStatus;
}
