/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */

package io.holoinsight.server.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.holoinsight.server.common.dao.entity.MetricInfo;
import io.holoinsight.server.common.dao.entity.dto.MetricInfoDTO;

import java.util.List;

/**
 * @author jsy1001de
 * @version 1.0: MetricInfoService.java, Date: 2023-04-24 Time: 20:28
 */
public interface MetricInfoService extends IService<MetricInfo> {

  void create(MetricInfoDTO metricInfoDTO);

  void update(MetricInfoDTO metricInfoDTO);

  List<MetricInfoDTO> queryListByTenant(String tenant, String workspace);

  List<MetricInfoDTO> queryListByTenantProduct(String tenant, String workspace, String product);

  MetricInfoDTO queryByMetric(String tenant, String workspace, String metric);

}
