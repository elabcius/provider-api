package util;

import io.swagger.model.Channel;
import io.swagger.model.Provider;
import io.swagger.model.TvProgram;
import io.swagger.model.TvProgramming;

import java.util.ArrayList;
import java.util.List;

public class ProviderUtil {

    private List<Provider> providerList = new ArrayList<>();

    public Provider getMockProvider(String idProvider, String nameProvider, String emailProvider) {
        Provider provider = new Provider();
        provider.id(idProvider);
        provider.setName(nameProvider);
        provider.setEmail(emailProvider);
        provider.setChannel(getMockChannel());

        return provider;
    }

    public ProviderUtil() {
        providerList.add(getMockProvider("1", "HBO", "support@hbo.com"));
        providerList.add(getMockProvider("2", "FOX Premium", "support@fox.com"));
    }

    public List<Provider> getMockProviderList() {
        return providerList;
    }

    public List<Provider> getMockOneProviderList(String idProvider) {
        List<Provider> providers = new ArrayList<>();
        providerList.forEach(provider -> {
            if (provider.getProviderId().equalsIgnoreCase(idProvider)) {
             providers.add(provider);
            }
        });

        return providers;
    }

    public void addMockProvider(Provider provider){
        providerList.add(provider);
    }

    public void deleteProvider(Provider provider) {
        providerList.remove(provider);
    }

    private TvProgramming getMockTvProgramming(String idTvProgramming) {
        TvProgramming tvProgramming = new TvProgramming();

        tvProgramming.setIdentification("1");
        tvProgramming.setName("Series");
        tvProgramming.setTvPrograms(getMockTvProgram());

        return tvProgramming;
    }

    private List<TvProgram> getMockTvProgram() {
        List<TvProgram> tvProgramList = new ArrayList<>();

        TvProgram tvProgram1 = new TvProgram();
        tvProgram1.setIdentification("1");
        tvProgram1.setName("Spartacus");
        tvProgram1.setScheduleTime("10-10-2012T08:00");
        tvProgramList.add(tvProgram1);

        TvProgram tvProgram2 = new TvProgram();
        tvProgram2.setIdentification("2");
        tvProgram2.setName("House of Cards");
        tvProgram2.setScheduleTime("10-11-2017T22:00");
        tvProgramList.add(tvProgram2);

        return tvProgramList;
    }

    private List<Channel> getMockChannel() {
        List<Channel> channelList = new ArrayList<>();

        Channel channel1 = new Channel();
        channel1.setChannelId("1");
        channel1.setName("HBO Signature");
        channel1.setType("Familiar");
        channel1.setTvProgramming(getMockTvProgramming("1"));
        channelList.add(channel1);
        return channelList;
    }
}
