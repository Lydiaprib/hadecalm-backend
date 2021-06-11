package application.service;

import application.persistence.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import application.persistence.model.Branch;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("branch")
public class TreeController {

  @Autowired
  private BranchRepository branchRepository;

  @GetMapping("/")
  public ResponseEntity<List<Branch>> getAll() {
    return ResponseEntity.ok(branchRepository.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Branch>> getBranch(
          @PathVariable (value = "id") String id) {
    return ResponseEntity.ok(branchRepository.findById(id));
  }

  @PostMapping("/")
  public ResponseEntity<Branch> postBranch(
          @RequestBody Branch branch) {
    return ResponseEntity.ok(branchRepository.insert(branch));
  }

  @GetMapping("/children/{parentId}")
  public ResponseEntity<List<Branch>> getByParentId(
          @PathVariable (value = "parentId") String parentId) {
    return ResponseEntity.ok(branchRepository.findByParentId(parentId));
  }

}