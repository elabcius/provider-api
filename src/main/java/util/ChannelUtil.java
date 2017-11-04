package util;

import io.swagger.model.Channel;
import io.swagger.model.TvProgram;
import io.swagger.model.TvProgramming;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ChannelUtil {

  public static List<Channel> getChannels() {
    List<Channel> channels = new ArrayList<>();
    Channel channel;
    TvProgramming tvProgramming;
    for (int i = 0; i < 10; i++) {
      channel = new Channel();
      channel.setId(UUID.fromString("" + i).toString());
      channel.setName("Channel " + i);
      channel.setType("Type " + i);

      tvProgramming = new TvProgramming();
      tvProgramming.setId(UUID.fromString("" + i).toString());
      tvProgramming.setName("Programming " + i);
      tvProgramming.setTvPrograms(getPrograms());

      channel.setTvProgramming(tvProgramming);
    }

    return channels;
  }

  private static List<TvProgram> getPrograms() {
    List<TvProgram> tvPrograms = new ArrayList<>();
    TvProgram tvProgram;
    for (int i = 0; i < 10; i++) {
      tvProgram = new TvProgram();
      tvProgram.setId(UUID.fromString("" + i).toString());
      tvProgram.setName("Channel " + i);
      tvProgram.setScheduleTime(new Date().toString());
    }

    return tvPrograms;
  }


}
