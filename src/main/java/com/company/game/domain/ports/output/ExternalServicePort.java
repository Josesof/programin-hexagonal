package com.company.game.domain.ports.output;

import com.company.game.domain.model.AdditionalTaskInfo;

public interface ExternalServicePort {

  AdditionalTaskInfo getAdditionalTaskInfo(Long taskId);
}
