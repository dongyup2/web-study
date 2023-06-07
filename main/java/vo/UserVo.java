package vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserVo {
	private String id;
	private String password;
	private String name;
	private String email;
}
