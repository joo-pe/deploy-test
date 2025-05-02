package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;
import java.util.List;

@RestController
public class MemberController {
    @Operation(summary = "Get all members", description = "Retrieve a list of all members.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the list of members"),
    })
    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return null;
    }

    @Operation(summary = "Create a new member", description = "Add a new member to the system.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Successfully created the member"),
            @ApiResponse(responseCode = "400", description = "Invalid input data"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping("/members")
    public Member createMember(@RequestBody Member member) {
        return null;
    }
}
