package com.electro.controller.statistic;

import com.electro.constant.AppConstants;
import com.electro.model.reponse.statistic.StatisticResponse;
import com.electro.service.statistic.StatisticService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
@CrossOrigin(AppConstants.FRONTEND_HOST)
public class StatisticController {

    private final StatisticService statisticService;

    @GetMapping
    public ResponseEntity<StatisticResponse> getStatistic() {
        // TODO: [28-03-2023] Chưa rõ API này có lấy thống kê theo 7 ngày gần nhất?
        return ResponseEntity.status(HttpStatus.OK).body(statisticService.getStatistic());
    }

}
