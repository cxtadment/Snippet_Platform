package com.xiaoting.client.template;

import com.xiaoting.common.interfaces.IDto;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public interface IReadOnlyTemplateWithUri<T extends IDto> {

    // find - one

    T findOneByUri(final String uri, final Pair<String, String> credentials);

    // find - all

    List<T> findAllByUri(final String uri, final Pair<String, String> credentials);

}
